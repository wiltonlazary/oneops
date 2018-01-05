/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.DjDeploymentRfcStatesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjDeploymentRfcStates extends TableImpl<DjDeploymentRfcStatesRecord> {

    private static final long serialVersionUID = -335115646;

    /**
     * The reference instance of <code>kloopzcm.dj_deployment_rfc_states</code>
     */
    public static final DjDeploymentRfcStates DJ_DEPLOYMENT_RFC_STATES = new DjDeploymentRfcStates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjDeploymentRfcStatesRecord> getRecordType() {
        return DjDeploymentRfcStatesRecord.class;
    }

    /**
     * The column <code>kloopzcm.dj_deployment_rfc_states.state_id</code>.
     */
    public final TableField<DjDeploymentRfcStatesRecord, Integer> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc_states.state_name</code>.
     */
    public final TableField<DjDeploymentRfcStatesRecord, String> STATE_NAME = createField("state_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>kloopzcm.dj_deployment_rfc_states</code> table reference
     */
    public DjDeploymentRfcStates() {
        this(DSL.name("dj_deployment_rfc_states"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_deployment_rfc_states</code> table reference
     */
    public DjDeploymentRfcStates(String alias) {
        this(DSL.name(alias), DJ_DEPLOYMENT_RFC_STATES);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_deployment_rfc_states</code> table reference
     */
    public DjDeploymentRfcStates(Name alias) {
        this(alias, DJ_DEPLOYMENT_RFC_STATES);
    }

    private DjDeploymentRfcStates(Name alias, Table<DjDeploymentRfcStatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjDeploymentRfcStates(Name alias, Table<DjDeploymentRfcStatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DJ_DEPLOYMENT_RFC_STATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjDeploymentRfcStatesRecord> getPrimaryKey() {
        return Keys.DJ_DEPLOYMENT_RFC_STATES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjDeploymentRfcStatesRecord>> getKeys() {
        return Arrays.<UniqueKey<DjDeploymentRfcStatesRecord>>asList(Keys.DJ_DEPLOYMENT_RFC_STATES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRfcStates as(String alias) {
        return new DjDeploymentRfcStates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRfcStates as(Name alias) {
        return new DjDeploymentRfcStates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjDeploymentRfcStates rename(String name) {
        return new DjDeploymentRfcStates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjDeploymentRfcStates rename(Name name) {
        return new DjDeploymentRfcStates(name, null);
    }
}