package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e2d44f3;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 19558
 */
public class M20APIT extends EntityType
{
    /** Default constructor */
    public M20APIT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)1); // uid 19554, 12.7-mm (.50 Cal)
        setSpecific((byte)4); // uid 19558, M20 API-T
    }
}
