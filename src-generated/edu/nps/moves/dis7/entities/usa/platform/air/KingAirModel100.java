package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@67bb4dcd;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23793
 */
public class KingAirModel100 extends EntityType
{
    /** Default constructor */
    public KingAirModel100()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23782, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)22); // uid 23790, Twin Engine Turboprop
        setSpecific((byte)1); // uid 23791, Beechcraft King Air
        setExtra((byte)2); // uid 23793, King Air Model 100
    }
}
