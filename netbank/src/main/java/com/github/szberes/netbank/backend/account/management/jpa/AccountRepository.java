package com.github.szberes.netbank.backend.account.management.jpa;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

    List<AccountEntity> findAccountByOwnerId(String ownerId);

    AccountEntity findAccountByOwnerIdAndAccountName(String ownerId, String accountName);
}
