package edu.nps.moves.dis7.entities.gbr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30b975ad;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 15613
 */
public class S102Valiant extends EntityType
{
    /** Default constructor */
    public S102Valiant()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 15597, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)3); // uid 15612, Valiant Class
        setSpecific((byte)1); // uid 15613, S 102 Valiant
    }
}
