package edu.nps.moves.dis7.entities.bra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6093dd95;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 32647
 */
public class S32Timbira extends EntityType
{
    /** Default constructor */
    public S32Timbira()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 32643, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 32644, Tupi Class
        setSpecific((byte)3); // uid 32647, S32 Timbira
    }
}
