package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cce5371;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 16203
 */
public class S648Jun extends EntityType
{
    /** Default constructor */
    public S648Jun()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16195, SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins Dattaque)
        setSubCategory((byte)2); // uid 16201, Daphne Class
        setSpecific((byte)2); // uid 16203, S 648 Jun
    }
}
