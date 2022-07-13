package com.sum414ever.stocks.domain.repository

import com.sum414ever.stocks.domain.model.CompanyInfo
import com.sum414ever.stocks.domain.model.CompanyListings
import com.sum414ever.stocks.domain.model.IntradayInfo
import com.sum414ever.stocks.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListings>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}