package edu.nps.moves.dis7.entities.tur.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f5b8250;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23206
 */
public class S357Gur extends EntityType
{
    /** Default constructor */
    public S357Gur()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 19067, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 23201, Preveze class
        setSpecific((byte)5); // uid 23206, S357 Gur
    }
}
