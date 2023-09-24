package com.oguzhan.server;

import com.oguzhan.server.enumaration.Status;
import com.oguzhan.server.model.Server;
import com.oguzhan.server.repo.IServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.oguzhan.server.enumaration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(IServerRepo serverRepo){
		return  args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB",
					"Personal PC 1","http://localhost:8080/server/image/server1.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.161", "Ubuntu", "32 GB",
					"Personal PC 2","http://localhost:8080/server/image/server2.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.162", "Linux", "64 GB",
					"Personal PC 3","http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.163", "Ubuntu Linux 2", "128 GB",
					"Personal PC 4","http://localhost:8080/server/image/server4.png", SERVER_UP));
		};
	}

}
