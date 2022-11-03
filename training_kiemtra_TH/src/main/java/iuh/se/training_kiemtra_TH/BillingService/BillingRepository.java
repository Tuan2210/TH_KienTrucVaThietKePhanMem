package iuh.se.training_kiemtra_TH.BillingService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing, String> {
	
	//not use Optional<> or Obj of findById JPA
	@Query(value = "SELECT * FROM billing where BillId = ?", nativeQuery = true)
	public Billing findBillingById(String billId);
	
}
