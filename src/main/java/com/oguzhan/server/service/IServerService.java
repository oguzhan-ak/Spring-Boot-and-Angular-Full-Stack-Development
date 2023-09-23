package com.oguzhan.server.service;

import com.oguzhan.server.model.Server;

import java.util.Collection;

public interface IServerService {
    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
