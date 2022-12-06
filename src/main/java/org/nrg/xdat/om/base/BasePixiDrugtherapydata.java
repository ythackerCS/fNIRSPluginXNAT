package org.nrg.xdat.om.base;

import org.nrg.xdat.XDAT;
import org.nrg.xdat.om.base.auto.AutoPixiDrugtherapydata;
import org.nrg.xft.ItemI;
import org.nrg.xft.security.UserI;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Hashtable;

@SuppressWarnings({"unchecked","rawtypes"})
public abstract class BasePixiDrugtherapydata extends AutoPixiDrugtherapydata {

	public BasePixiDrugtherapydata(ItemI item)
	{
		super(item);
	}

	public BasePixiDrugtherapydata(UserI user)
	{
		super(user);
	}

	/*
	 * @deprecated Use BasePixiDrugtherapydata(UserI user)
	 **/
	public BasePixiDrugtherapydata()
	{}

	public BasePixiDrugtherapydata(Hashtable properties, UserI user)
	{
		super(properties,user);
	}

	public static Integer getCountForSubject(final String subject_id) {
		final NamedParameterJdbcTemplate template = XDAT.getContextService().getBean(NamedParameterJdbcTemplate.class);
		return template.queryForObject(QUERY_COUNT_WEIGHT_EXPERIMENTS_BY_SUBJECT_ID, new MapSqlParameterSource(SUBJECT_ID_PARAMETER, subject_id), Integer.class);
	}

	private static final String SUBJECT_ID_PARAMETER = "subject_id";
	private static final String QUERY_COUNT_WEIGHT_EXPERIMENTS_BY_SUBJECT_ID = "SELECT COUNT(*) " +
			"FROM pixi_drugtherapydata as w INNER JOIN (" +
			"SELECT id, subject_id " +
			"FROM xnat_subjectassessordata " +
			"WHERE subject_id = :subject_id" +
			") as s " +
			"ON w.id = s.id";
}
