package com.piaoniu.demo.service.impl;

import com.piaoniu.demo.dao.TicketDao;
import com.piaoniu.demo.model.IndexModel;
import com.piaoniu.demo.pojo.Hall;
import com.piaoniu.demo.pojo.Seat;
import com.piaoniu.demo.pojo.Show;
import com.piaoniu.demo.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TicketServiceImpl implements TicketService {
    @Resource
    TicketDao ticketDao;

    @Override
    public List<IndexModel> SelectCCBySid(String show_name) {
        return ticketDao.SelectCCBySid(show_name);
    }

    @Override
    public List<Hall> SelectZTBySid(int show_id) {
        return ticketDao.SelectZTBySid(show_id);
    }

    @Override
    public List<Seat> SelectSeatByHall(int hall_id) {
        return ticketDao.SelectSeatByHall(hall_id);
    }

    @Override
    public int UpdateSeatStatus(int seat_id) {
        return ticketDao.UpdateSeatStatus(seat_id);
    }
    public Set SelectSeatMoney(int show_id){
        Set set=new HashSet();
        List<Hall> list=this.SelectZTBySid(show_id);
        for(int i=0;i<list.size();i++){
            List<Seat> list1=this.SelectSeatByHall(list.get(i).getHall_id());
            for (int z=0;z<list1.size();z++){
                set.add(list1.get(z).getSeat_money());
            }
        }
        return set;
    }

    @Override
    public String SelectSeatByMoneyAndSid(Seat seat) {
        if(ticketDao.SelectSeatByMoneyAndSid(seat).size()>=seat.getSeat_num()){
            for(int i=0;i<seat.getSeat_num();i++){
                this.UpdateSeatStatus(ticketDao.SelectSeatByMoneyAndSid(seat).get(i).getSeat_id());
                return "购票成功";
            }
        }else {
            return "余票不足，余票为"+ticketDao.SelectSeatByMoneyAndSid(seat).size()+"张";
        }
        return "";
    }
}
