/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.player.generated.database.tables;


import be.yildizgames.engine.feature.player.generated.database.Indexes;
import be.yildizgames.engine.feature.player.generated.database.Keys;
import be.yildizgames.engine.feature.player.generated.database.Public;
import be.yildizgames.engine.feature.player.generated.database.tables.records.PlayersRecord;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class Players extends TableImpl<PlayersRecord> {

    private static final long serialVersionUID = 883988649;

    /**
     * The reference instance of <code>PUBLIC.PLAYERS</code>
     */
    public static final Players PLAYERS = new Players();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayersRecord> getRecordType() {
        return PlayersRecord.class;
    }

    /**
     * The column <code>PUBLIC.PLAYERS.PLY_ID</code>.
     */
    public final TableField<PlayersRecord, Short> PLY_ID = createField("PLY_ID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.PLAYERS.ACC_ID</code>.
     */
    public final TableField<PlayersRecord, Short> ACC_ID = createField("ACC_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>PUBLIC.PLAYERS.ACTIVE</code>.
     */
    public final TableField<PlayersRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>PUBLIC.PLAYERS.ONLINE</code>.
     */
    public final TableField<PlayersRecord, Boolean> ONLINE = createField("ONLINE", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>PUBLIC.PLAYERS.ROLE</code>.
     */
    public final TableField<PlayersRecord, Byte> ROLE = createField("ROLE", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>PUBLIC.PLAYERS.NAME</code>.
     */
    public final TableField<PlayersRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.PLAYERS</code> table reference
     */
    public Players() {
        this(DSL.name("PLAYERS"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.PLAYERS</code> table reference
     */
    public Players(String alias) {
        this(DSL.name(alias), PLAYERS);
    }

    /**
     * Create an aliased <code>PUBLIC.PLAYERS</code> table reference
     */
    public Players(Name alias) {
        this(alias, PLAYERS);
    }

    private Players(Name alias, Table<PlayersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Players(Name alias, Table<PlayersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_D6);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PlayersRecord, Short> getIdentity() {
        return Keys.IDENTITY_PLAYERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PlayersRecord> getPrimaryKey() {
        return Keys.PK_PLAYERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlayersRecord>> getKeys() {
        return Arrays.<UniqueKey<PlayersRecord>>asList(Keys.PK_PLAYERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Players as(String alias) {
        return new Players(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Players as(Name alias) {
        return new Players(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(String name) {
        return new Players(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Players rename(Name name) {
        return new Players(name, null);
    }
}
