package com.gzcxadfzc.nationalAssembly.api;

import com.gzcxadfzc.nationalAssembly.request.BillInfoListRequest;
import com.gzcxadfzc.nationalAssembly.response.common.PublicDataNationalAssemblyResponse;
import com.gzcxadfzc.nationalAssembly.response.item.RecentBillItem;

public interface NationalAssemblyLegislationInfoApi {
    PublicDataNationalAssemblyResponse<RecentBillItem> getRecentBill(BillInfoListRequest message);
}
