package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@41f4039e;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26134
 */
public class CheyenneHighEndurenceTracker extends EntityType
{
    /** Default constructor */
    public CheyenneHighEndurenceTracker()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 23782, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)22); // uid 23790, Twin Engine Turboprop
        setSpecific((byte)3); // uid 26130, Piper PA-42 Cheyenne
        setExtra((byte)4); // uid 26134, Cheyenne High Endurence Tracker
    }
}
