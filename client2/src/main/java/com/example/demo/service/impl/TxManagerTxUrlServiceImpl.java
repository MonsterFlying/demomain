package com.example.demo.service.impl;

import com.codingapi.tx.config.service.TxManagerTxUrlService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author wangguo
 */
@Service
public class TxManagerTxUrlServiceImpl implements TxManagerTxUrlService {

    @Value("${txmanager.url}")
    private String txUrl;

    @Override
    public String getTxUrl() {
        return txUrl;
    }
}
