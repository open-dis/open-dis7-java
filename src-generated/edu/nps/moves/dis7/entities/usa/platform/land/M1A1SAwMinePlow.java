package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@261db982;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26161
 */
public class M1A1SAwMinePlow extends EntityType
{
    /** Default constructor */
    public M1A1SAwMinePlow()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 10018, Tank
        setSubCategory((byte)1); // uid 10019, M1 Abrams
        setSpecific((byte)13); // uid 26159, M1A1 SA
        setExtra((byte)2); // uid 26161, M1A1 SA w/ Mine Plow
    }
}
