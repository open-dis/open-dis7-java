package edu.nps.moves.dis7.entities.jpn.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@47058864;
 * Country: Japan (JPN);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 30228
 */
public class Type97LightWeightTorpedo extends EntityType
{
    /** Default constructor */
    public Type97LightWeightTorpedo()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 30226, Guided
        setSubCategory((byte)2); // uid 30228, Type 97 Light Weight Torpedo
    }
}
