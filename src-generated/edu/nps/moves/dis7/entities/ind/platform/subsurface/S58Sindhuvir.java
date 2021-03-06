package edu.nps.moves.dis7.entities.ind.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38831718;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 23194
 */
public class S58Sindhuvir extends EntityType
{
    /** Default constructor */
    public S58Sindhuvir()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23189, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 23190, Sindhughosh (Kilo) Class
        setSpecific((byte)4); // uid 23194, S 58 Sindhuvir
    }
}
