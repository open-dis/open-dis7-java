package edu.nps.moves.dis7.entities.grc.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21fd5faa;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23394
 */
public class S112Triton extends EntityType
{
    /** Default constructor */
    public S112Triton()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23390, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23391, Glavkos class
        setSpecific((byte)3); // uid 23394, S112 Triton
    }
}
