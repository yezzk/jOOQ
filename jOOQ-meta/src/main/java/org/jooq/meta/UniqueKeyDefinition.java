/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.meta;

import java.util.List;

/**
 * An object holding information about an inverse foreign key relationship.
 * <p>
 * This object may either represent a primary key or a unique key. It holds a
 * list of foreign keys referencing this key.
 *
 * @author Lukas Eder
 */
public interface UniqueKeyDefinition extends ConstraintDefinition {

    /**
     * Whether this unique key is the primary key
     */
    boolean isPrimaryKey();

    /**
     * The list of columns making up the primary key.
     */
    List<ColumnDefinition> getKeyColumns();

    /**
     * The foreign keys referencing this primary key
     */
    List<ForeignKeyDefinition> getForeignKeys();

    /**
     * Resolve a referenced key.
     * <p>
     * If this key coincides with a foreign key, resolve that foreign key
     * recursively. In case of ambiguity (two foreign keys coinciding with a
     * single unique key), this returns <code>null</code>.
     */
    UniqueKeyDefinition resolveReferencedKey();

}
