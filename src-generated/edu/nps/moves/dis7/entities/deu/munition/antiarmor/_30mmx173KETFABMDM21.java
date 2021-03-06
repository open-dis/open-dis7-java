package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50e5032c;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 28827
 */
public class _30mmx173KETFABMDM21 extends EntityType
{
    /** Default constructor */
    public _30mmx173KETFABMDM21()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21215, Ballistic
        setSubCategory((byte)14); // uid 28825, 30mm x173
        setSpecific((byte)2); // uid 28827, 30mm x173 KETF/ABM DM21
    }
}
