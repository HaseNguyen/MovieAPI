package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.LichChieu;

public interface LichChieuRepository extends JpaRepository<LichChieu, Integer> {
	@Query("SELECT MAX(d.LICHCHIEU_ID) FROM LichChieu d")
	int maxLichChieu_ID();
	
	@Query("SELECT d.MALICHCHIEU FROM LichChieu d WHERE d.LICHCHIEU_ID = :LICHCHIEU_ID")
	String findMaLichChieu(int LICHCHIEU_ID);
	
	@Query("SELECT d FROM LichChieu d WHERE d.PHIM_ID =:PHIM_ID")
	List<LichChieu> findLichChieuByPhimID(int PHIM_ID);
}
