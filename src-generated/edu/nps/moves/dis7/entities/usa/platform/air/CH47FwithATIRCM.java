package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7e15f4d4;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26105
 */
public class CH47FwithATIRCM extends EntityType
{
    /** Default constructor */
    public CH47FwithATIRCM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)23); // uid 11153, Cargo helicopter
        setSubCategory((byte)1); // uid 11154, Boeing Models 114/414
        setSpecific((byte)9); // uid 23004, CH-47F
        setExtra((byte)2); // uid 26105, CH-47F with ATIRCM
    }
}
