package com.sum414ever.stocks.data.mappers

import com.sum414ever.stocks.data.local.CompanyListingEntity
import com.sum414ever.stocks.data.remote.dto.CompanyInfoDto
import com.sum414ever.stocks.domain.model.CompanyInfo
import com.sum414ever.stocks.domain.model.CompanyListings

fun CompanyListingEntity.toCompanyListing() = CompanyListings(name, symbol, exchange)

fun CompanyListings.toCompanyListingEntity() = CompanyListingEntity(name, symbol, exchange)

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}
