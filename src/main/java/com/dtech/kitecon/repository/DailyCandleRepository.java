package com.dtech.kitecon.repository;

import com.dtech.kitecon.data.DailyCandle;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyCandleRepository extends BaseCandleRepository<DailyCandle, Long> {

  @Override
  default String getInterval() {
    return "day";
  }
}


