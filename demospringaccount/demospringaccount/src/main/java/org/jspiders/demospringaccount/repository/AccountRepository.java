package org.jspiders.demospringaccount.repository;

import org.jspiders.demospringaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    //withdraw
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Account set amt=amt-?2 where accNo=?1")
    void withdrawAmountByAccNo(long accNo, double amt);

    //deposite
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Account set amt=amt+?2 where accNo=?1")
    void saveAmountByAccNo(long accNo, double amt);
}
