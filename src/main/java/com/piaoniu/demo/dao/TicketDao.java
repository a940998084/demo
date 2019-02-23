package com.piaoniu.demo.dao;

import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.pojo.Show;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketDao {
    List<IndexModel> SelectCCBySid(String show_name);
    List<Hall> SelectZTBySid(int show_id);
    List<Seat> SelectSeatByHall(int hall_id);
    int UpdateSeatStatus(int seat_id);
    List<Seat> SelectSeatByMoneyAndSid(Seat seat);
}
