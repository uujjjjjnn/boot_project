package com.lec.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lec.domain.Board;
import com.lec.domain.Member;

public interface BoardService {

	long getTotalRowCount(Board board);
	Board getBoard(Board board);
	Page<Board> getBoardList(Pageable pageable, String searchType, String searchWord);
	void insertBoard(Board board);
	void updateBoard(Board board);
	void deleteBoard(Board board);
	int updateReadCount(Board board);
	int incrementMemberCnt(Member member);
	//Page<Board> getBoardMyList(Pageable pageable, String searchType, String searchWord);
	//List<Board> getBoardByListMemberId(String memberId);
	//List<Board> getBoardByListMemberId(Member member);
	Page<Board> getBoardMyListbyMemberId(Pageable pageable, String searchType, String searchWord, Member member);

	
}
