package edu.nps.moves.dis7.entities.gbr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b0dc227;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 15610
 */
public class S108Sovereign extends EntityType
{
    /** Default constructor */
    public S108Sovereign()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 15597, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)2); // uid 15606, Swiftsure Class
        setSpecific((byte)4); // uid 15610, S 108 Sovereign
    }
}
