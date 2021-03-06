package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@44d43cc9;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 19505
 */
public class M2ball extends EntityType
{
    /** Default constructor */
    public M2ball()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 19499, Ballistic
        setSubCategory((byte)2); // uid 19501, 12.7-mm/.50 caliber
        setSpecific((byte)4); // uid 19505, M2 ball
    }
}
