package edu.nps.moves.dis7.entities.dza.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b1a58a3;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 32591
 */
public class _031ElOuarsenis extends EntityType
{
    /** Default constructor */
    public _031ElOuarsenis()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27035, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 27036, Kilo Class
        setSpecific((byte)5); // uid 32591, 031 El Ouarsenis
    }
}
