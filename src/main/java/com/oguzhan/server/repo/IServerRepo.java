package com.oguzhan.server.repo;

import com.oguzhan.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
