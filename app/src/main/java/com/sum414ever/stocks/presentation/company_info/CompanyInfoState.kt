package com.sum414ever.stocks.presentation.company_info

import com.sum414ever.stocks.domain.model.CompanyInfo
import com.sum414ever.stocks.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
