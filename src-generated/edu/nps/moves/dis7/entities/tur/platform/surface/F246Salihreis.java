package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6573d2f7;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23257
 */
public class F246Salihreis extends EntityType
{
    /** Default constructor */
    public F246Salihreis()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23253, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23254, Barbaros class
        setSpecific((byte)3); // uid 23257, F246 Salihreis
    }
}
