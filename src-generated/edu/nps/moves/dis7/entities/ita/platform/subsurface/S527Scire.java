package edu.nps.moves.dis7.entities.ita.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f9a01c1;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 29492
 */
public class S527Scire extends EntityType
{
    /** Default constructor */
    public S527Scire()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18649, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)4); // uid 18663, Todaro Class (Type 212A)
        setSpecific((byte)2); // uid 29492, S527 Scire
    }
}
