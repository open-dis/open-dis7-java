package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23ab930d;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27045
 */
public class _351DjebelChenoua extends EntityType
{
    /** Default constructor */
    public _351DjebelChenoua()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27039, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 27044, Djebel Chenoua (C 58) class
        setSpecific((byte)1); // uid 27045, 351 Djebel Chenoua
    }
}
