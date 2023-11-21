package com.example.bookmyshowsep23.repositories;

import com.example.bookmyshowsep23.models.Show;
import com.example.bookmyshowsep23.models.ShowSeatType;
import org.hibernate.boot.model.internal.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShow(Show show);
    //select * from show_seattype where show_id = <123>
}
