package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50687efb;
 * Country: Kuwait (KWT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17929
 */
public class L401ALSoumood extends EntityType
{
    /** Default constructor */
    public L401ALSoumood()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17927, Auxiliary
        setSubCategory((byte)1); // uid 17928, AL Tahaddy Class (LCM/AKL)
        setSpecific((byte)1); // uid 17929, L401 AL Soumood
    }
}
