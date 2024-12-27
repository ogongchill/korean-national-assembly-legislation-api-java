package com.ogongchill.nationalAssembly.core.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.ogongchill.nationalAssembly.core.request.BillInfoListRequest;
import com.ogongchill.nationalAssembly.core.request.BillPetitionMemberListRequest;
import com.ogongchill.nationalAssembly.core.request.BillPromulgationInfoRequest;
import com.ogongchill.nationalAssembly.core.request.BillReceiptInfoRequest;
import com.ogongchill.nationalAssembly.core.request.JsictionComiteProcessListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentMoorListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentPasageListRequest;
import com.ogongchill.nationalAssembly.core.request.RecentRceptListRequest;
import com.ogongchill.nationalAssembly.core.request.SessionRequestListRequest;
import com.ogongchill.nationalAssembly.core.response.BillInfoListResponse;
import com.ogongchill.nationalAssembly.core.response.BillPetitionMemberListResponse;
import com.ogongchill.nationalAssembly.core.response.BillPromulgationInfoResponse;
import com.ogongchill.nationalAssembly.core.response.BillReceiptInfoResponse;
import com.ogongchill.nationalAssembly.core.response.JsictionComiteProcessListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentMoorListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentPasageListResponse;
import com.ogongchill.nationalAssembly.core.response.RecentRceptListResponse;

import com.ogongchill.nationalAssembly.core.response.SessionRequestListResponse;
import com.ogongchill.nationalAssembly.service.code.BillCode;
import com.ogongchill.nationalAssembly.service.code.ProposerCode;

import okhttp3.OkHttpClient;

class NationalAssemblyLegislationServiceTest {

	private static final String SERVICE_KEY = "65WaXo9KJDUa1A450QOIciMPg9NhtrgjoL0F6nCq3OcV7LAU3drzD5P537sEJpxZLWxZq9tHHZfpAbIiaINjbQ==";
	private final OkHttpClient client = new OkHttpClient();
	private NationalAssemblyLegislationApi api = NationalAssemblyLegislationService.from(SERVICE_KEY, client);

	@DisplayName("의안 목록 검색")
	@Test
	void getBillInfoList() {
		BillInfoListRequest request = BillInfoListRequest.builder()
			.proposerCode(ProposerCode.F01)
			.endProposeDate("2024-11-25")
			.startProposeDate("2024-11-25")
			.startOrdinal(22)
			.endOrdinal(22)
			.numOfRows(100)
			.build();
		BillInfoListResponse response = api.getBillInfoList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("최근 접수의안 목록 정보 조회")
	@Test
	void getRecentRceptList() {
		RecentRceptListRequest request = RecentRceptListRequest.builder()
			.numOfRows(100)
			.pageNo(1)
			.build();
		RecentRceptListResponse response = api.getRecentRceptList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("최근 통과의안 목록 정보 조회")
	@Test
	void getRecentPasageList() {
		RecentPasageListRequest request = RecentPasageListRequest.builder()
			.pageNo(1)
			.build();
		RecentPasageListResponse response = api.getRecentPasageList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("처리의안 목록 정보 조회")
	@Test
	void getJsictionComiteProcessList() {
		JsictionComiteProcessListRequest request = JsictionComiteProcessListRequest.builder()
			.startAgeCode(22)
			.billKindCd(BillCode.B04)
			.build();
		JsictionComiteProcessListResponse response = api.getJsictionComiteProcessList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("계류의안 목록 정보 조회")
	@Test
	void getRecentMoorList() {
		RecentMoorListRequest request = RecentMoorListRequest.builder()
			.billKindCode(BillCode.B02)
			.startAgeCode(22)
			.pageNo(1)
			.numOfRows(100)
			.build();
		RecentMoorListResponse response = api.getRecentMoorList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("본회의부의요청안건 목록 정보 조회")
	@Test
	void getSessionRequestList() {
		SessionRequestListRequest request = SessionRequestListRequest.builder()
			.billKindCd(BillCode.B02)
			.startAgeCd(22)
			.pageNo(1)
			.numOfRows(100)
			.build();
		SessionRequestListResponse response = api.getSessionRequestList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 접수 정보 조회")
	@Test
	void getBillReceiptInfo() {
		BillReceiptInfoRequest request = new BillReceiptInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillReceiptInfoResponse response = api.getBillReceiptInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안/청원 접수정보 국회의원 목록 조회")
	@Test
	void getBillPetitionMemberList() {
		BillPetitionMemberListRequest request = BillPetitionMemberListRequest.builder()
			.billId("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7")
			.gbn1("bill")
			.gbn2("reception")
			.build();
		BillPetitionMemberListResponse response = api.getBillPetitionMemberList(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}

	@DisplayName("의안 공포 정보 조회 - 응답 확인 필요")
	@Test
	void getBillPromulgationInfo() {
		BillPromulgationInfoRequest request = new BillPromulgationInfoRequest("PRC_X2X4V1W1V0V6D2D0C1A4B2Z3A6I3I7");
		BillPromulgationInfoResponse response = api.getBillPromulgationInfo(request);
		System.out.println(response.toString());
		assertNotNull(response);
	}
}