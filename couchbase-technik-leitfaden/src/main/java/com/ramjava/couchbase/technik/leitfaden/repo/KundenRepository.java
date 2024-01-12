package com.ramjava.couchbase.technik.leitfaden.repo;

import com.ramjava.couchbase.technik.leitfaden.entity.Kunde;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "customer", viewName = "all")
public interface KundenRepository extends CouchbaseRepository<Kunde, Integer> {
}
