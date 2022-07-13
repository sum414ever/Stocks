package com.sum414ever.stocks.presentation.company_listings

import com.sum414ever.stocks.domain.model.CompanyListings

data class CompanyListingsState(
    val companies: List<CompanyListings> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)
