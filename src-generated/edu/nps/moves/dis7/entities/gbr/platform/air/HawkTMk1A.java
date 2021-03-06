package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4784efd9;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15018
 */
public class HawkTMk1A extends EntityType
{
    /** Default constructor */
    public HawkTMk1A()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 14994, Attack/Strike
        setSubCategory((byte)6); // uid 15016, BAE Systems Hawk
        setSpecific((byte)2); // uid 15018, Hawk T Mk 1A
    }
}
