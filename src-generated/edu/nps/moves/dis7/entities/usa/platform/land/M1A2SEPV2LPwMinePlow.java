package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@59c70ceb;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32129
 */
public class M1A2SEPV2LPwMinePlow extends EntityType
{
    /** Default constructor */
    public M1A2SEPV2LPwMinePlow()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 10018, Tank
        setSubCategory((byte)1); // uid 10019, M1 Abrams
        setSpecific((byte)17); // uid 32127, M1A2 System Enhancement Package (SEP) V2 Low-Profile (LP)
        setExtra((byte)2); // uid 32129, M1A2 SEP V2 LP w/ Mine Plow
    }
}
