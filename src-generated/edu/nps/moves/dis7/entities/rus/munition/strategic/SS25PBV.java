package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@538b3c88;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 20949
 */
public class SS25PBV extends EntityType
{
    /** Default constructor */
    public SS25PBV()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)22); // uid 20946, SS-25 Sickle
        setSpecific((byte)3); // uid 20949, SS-25 PBV
    }
}
