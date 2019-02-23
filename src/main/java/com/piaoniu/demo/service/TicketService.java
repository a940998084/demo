package com.piaoniu.demo.service;

import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.pojo.Show;

import java.util.List;
import java.util.Set;

public interface TicketService {
    List<IndexModel> SelectCCBySid(String show_name);
    List<Hall> SelectZTBySid(int show_id);
    List<Seat> SelectSeatByHall(int hall_id);
    int UpdateSeatStatus(int seat_id);
    Set SelectSeatMoney(int show_id);
    String SelectSeatByMoneyAndSid(Seat seat);
}
