package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58a84a12;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29925
 */
public class TLX1LowLevelHeightKeepingTowTarget extends EntityType
{
    /** Default constructor */
    public TLX1LowLevelHeightKeepingTowTarget()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)39); // uid 29924, Towed Air Target
        setSpecific((byte)1); // uid 29925, TLX-1 Low Level Height Keeping Tow Target
    }
}
