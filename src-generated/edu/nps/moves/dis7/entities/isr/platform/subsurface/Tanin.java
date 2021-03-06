package edu.nps.moves.dis7.entities.isr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7bb6ab3a;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18252
 */
public class Tanin extends EntityType
{
    /** Default constructor */
    public Tanin()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 18249, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 18250, Gal (Vickers Type 540) Class
        setSpecific((byte)2); // uid 18252, Tanin
    }
}
