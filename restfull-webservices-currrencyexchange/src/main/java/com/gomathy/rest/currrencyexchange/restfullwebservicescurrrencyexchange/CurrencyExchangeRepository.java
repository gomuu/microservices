package com.gomathy.rest.currrencyexchange.restfullwebservicescurrrencyexchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
CurrencyExchange findByFromAndTo(String from, String to);
}
