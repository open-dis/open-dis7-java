package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f15d60e
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 16194
 */
public class S607Turquoise extends EntityType
{
    public S607Turquoise()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 16186, SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires Dattaque (SNA))
        setSubCategory((byte)1); // uid 16187, Rubis Class (SNA 72)
        setSpecific((byte)7); // uid 16194, S 607 Turquoise
    }
}