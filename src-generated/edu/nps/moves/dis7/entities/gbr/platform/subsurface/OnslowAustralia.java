package edu.nps.moves.dis7.entities.gbr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e3572e8;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 15624
 */
public class OnslowAustralia extends EntityType
{
    /** Default constructor */
    public OnslowAustralia()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 15614, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 15620, Oberon Class
        setSpecific((byte)60); // uid 15624, Onslow (Australia)
    }
}
