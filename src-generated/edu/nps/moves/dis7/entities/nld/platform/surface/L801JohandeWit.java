package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a551a63
 * Country: Netherlands (NLD)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 23304
 */
public class L801JohandeWit extends EntityType
{
    public L801JohandeWit()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 23300, Amphibious Transport Dock
        setSubCategory((byte)2); // uid 23303, Johan De Witt Class
        setSpecific((byte)1); // uid 23304, L801 Johan de Wit
    }
}
