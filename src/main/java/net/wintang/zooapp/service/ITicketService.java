package net.wintang.zooapp.service;

import net.wintang.zooapp.entity.Ticket;
import net.wintang.zooapp.dto.response.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface ITicketService {
    ResponseEntity<ResponseObject> getTickets();

    ResponseEntity<ResponseObject> createTicket(Ticket ticket);
}
